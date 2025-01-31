package com.minar.birday.utilities

import android.view.View

interface OnItemClickListener {
    abstract fun onItemClick(position: Int, view: View?)

    abstract fun onItemLongClick(position: Int, view: View?): Boolean
}