package com.example.a0181_roomdatabase.view.route

import com.example.a0181_roomdatabase.R
import com.example.a0181_roomdatabase.uicontroller.DestinasiNavigasi

object DesitinasiDetailSiswa : DestinasiNavigasi {
    override val route = "item_details"
    override val titleRes = R.string.detail_siswa
    const val itemIdArg = "itemId"
    val routeWithArgs = "$route/{$itemIdArg}"
}
