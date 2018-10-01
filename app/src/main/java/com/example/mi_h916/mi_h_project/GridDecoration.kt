package com.example.mi_h916.mi_h_project

import android.graphics.Rect
import android.view.ViewGroup
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.View


class GridDecoration(sideMargin: Int) :RecyclerView.ItemDecoration() {
    private var halfMargin = 0
    private var halfMinusMargin = 0

    init {
        this.halfMargin = sideMargin / 2
        this.halfMinusMargin = -1 * halfMargin
    }

    override fun getItemOffsets(outRect: Rect, view: View, parent: RecyclerView, state: RecyclerView.State) {

        val adapterPosition = parent.getChildAdapterPosition(view)
        val lm = parent.layoutManager as GridLayoutManager
        val ssl = lm.spanSizeLookup
        val spanCount = lm.spanCount

        if (ssl.getSpanSize(adapterPosition) >= spanCount) {
            // 全幅（ヘッダーとか）
            val params = view.getLayoutParams() as ViewGroup.MarginLayoutParams
            params.setMargins(this.halfMinusMargin, params.topMargin, this.halfMinusMargin, 8)
            view.setLayoutParams(params)
            return
        }

        outRect.left = this.halfMargin
        outRect.bottom = this.halfMargin
        outRect.right = this.halfMargin
    }
}