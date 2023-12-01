package com.example.pc_hardwareshoppingapp.data

import com.example.pc_hardwareshoppingapp.R

class Datasource {
    fun loadPcHardware(): MutableList<PcHardware> {
        return mutableListOf(
            PcHardware(
                "Gaming-PC Neo Enigma, Intel i9-14900K, RTX 4090, Custom-WaKü",
                "Gaming PC",
                R.drawable.neo_enigma_gold
            )
        )
    }
}