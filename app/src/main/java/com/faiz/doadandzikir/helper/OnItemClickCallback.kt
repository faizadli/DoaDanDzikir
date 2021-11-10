package com.faiz.doadandzikir.helper

import com.faiz.doadandzikir.model.Artikel

interface OnItemClickCallback {
    fun onItemClicked(data: Artikel)
}