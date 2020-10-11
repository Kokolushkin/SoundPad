package com.example.soundpad

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_sound_pad.*

class SoundPadActivity : AppCompatActivity(), CellClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sound_pad)
        initView()
    }

    private fun initView() {
        recyclerViewSounds.layoutManager = GridLayoutManager(this,3)
        recyclerViewSounds.addItemDecoration(GridItemDecoration(10, 3))

        val soundListAdapter = SoundCardAdapter(this)
        recyclerViewSounds.adapter = soundListAdapter
        soundListAdapter.setSoundList(generateSoundList())
    }

    private fun generateSoundList(): List<Sound> {
        val listOfSound = mutableListOf<Sound>()

        var sound = Sound()
        sound.name = "Sound_1"
        listOfSound.add(sound)

        sound = Sound()
        sound.name = "Sound_2"
        listOfSound.add(sound)

        sound = Sound()
        sound.name = "Sound_3"
        listOfSound.add(sound)

        sound = Sound()
        sound.name = "Sound_4"
        listOfSound.add(sound)

        sound = Sound()
        sound.name = "Sound_5"
        listOfSound.add(sound)

        sound = Sound()
        sound.name = "Sound_6"
        listOfSound.add(sound)

        sound = Sound()
        sound.name = "Sound_7"
        listOfSound.add(sound)

        sound = Sound()
        sound.name = "Sound_8"
        listOfSound.add(sound)

        sound = Sound()
        sound.name = "Sound_9"
        listOfSound.add(sound)

        sound = Sound()
        sound.name = "Sound_10"
        listOfSound.add(sound)

        return listOfSound
    }
    override fun onCellClickListener() {
        Toast.makeText(this,"Cell clicked", Toast.LENGTH_SHORT).show()
    }
}