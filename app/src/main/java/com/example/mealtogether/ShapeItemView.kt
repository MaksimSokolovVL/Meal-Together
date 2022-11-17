package com.example.mealtogether

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import com.example.mealtogether.databinding.ViewItemShapeBinding

class ShapeItemView
@JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAtte: Int = 0
) : LinearLayout(context, attrs, defStyleAtte) {
    private val binding = ViewItemShapeBinding.inflate(LayoutInflater.from(context))

    fun getBinding(): ViewItemShapeBinding
    {
        return binding
    }

    init {
        addView(binding.root)
    }
}