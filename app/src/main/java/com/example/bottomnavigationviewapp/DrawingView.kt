package com.example.bottomnavigationviewapp

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.graphics.Path
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

class DrawingView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private val paths = mutableListOf<Pair<Path, Paint>>()
    private var currentPath = Path()
    private val paint = Paint().apply {
        color = Color.BLACK
        isAntiAlias = true
        strokeWidth = 12f
        style = Paint.Style.STROKE
        strokeJoin = Paint.Join.ROUND
        strokeCap = Paint.Cap.ROUND
    }

    init {
        paths.add(Pair(currentPath, Paint(paint)))
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        // Draw all the paths
        for ((path, paint) in paths) {
            canvas.drawPath(path, paint)
        }
    }

    override fun onTouchEvent(event: MotionEvent): Boolean {
        val x = event.x
        val y = event.y

        when (event.action) {
            MotionEvent.ACTION_DOWN -> {
                currentPath = Path()
                paths.add(Pair(currentPath, Paint(paint)))
                currentPath.moveTo(x, y)
                invalidate()
                return true
            }
            MotionEvent.ACTION_MOVE -> {
                currentPath.lineTo(x, y)
                invalidate()
                return true
            }
            MotionEvent.ACTION_UP -> {
                currentPath.lineTo(x, y)
                invalidate()
                return true
            }
            else -> return false
        }
    }

    // Method to clear the canvas
    fun clearCanvas() {
        paths.clear()
        currentPath = Path()
        paths.add(Pair(currentPath, Paint(paint)))
        invalidate()
    }
}