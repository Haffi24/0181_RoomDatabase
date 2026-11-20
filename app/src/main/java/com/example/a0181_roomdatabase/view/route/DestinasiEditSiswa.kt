package com.example.a0181_roomdatabase.view.route

import com.example.a0181_roomdatabase.R
import com.example.a0181_roomdatabase.uicontroller.DestinasiNavigasi

object DestinasiEditSiswa : DestinasiNavigasi {
    override val route = "item_edit"
    override val titleRes = R.string.edit_siswa
    const val itemIdArg = "idSiswa"

    val routeWithArgs = "$route/{$itemIdArg}"
}
