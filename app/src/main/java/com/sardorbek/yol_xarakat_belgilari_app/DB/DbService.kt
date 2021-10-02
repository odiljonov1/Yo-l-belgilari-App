package com.sardorbek.yol_xarakat_belgilari_app.DB

import com.sardorbek.yol_xarakat_belgilari_app.Models.Belgi


interface DbService {
    fun addLabel(belgi: Belgi)
    fun editLabel(belgi: Belgi):Int
    fun deleteLabel(belgi: Belgi)
    fun getAllLabel():ArrayList<Belgi>
}