package com.sample.melone

import android.media.MediaPlayer
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageView
import com.bumptech.glide.Glide

class MelonDetailActivity : AppCompatActivity() {

    lateinit var playPauseButton : ImageView
    lateinit var mediaPlayer : MediaPlayer
    lateinit var melonItemList: ArrayList<MelonItem>
    var position = 0
        set(value) {
            if(value <= 0) field = 0
            else if (value >= melonItemList.size - 1) field = melonItemList.size - 1
            else field = value
        }
    var is_playing: Boolean = true
        set(value) {
            if(value == true){
                this.resources.getDrawable(R.drawable.pause, this.theme)
            }else{
                this.resources.getDrawable(R.drawable.play, this.theme)
            }
            field = value
        }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_melon_detail)

        melonItemList = intent.getStringArrayListExtra("melon_item_list") as ArrayList<MelonItem>
        position = intent.getIntExtra("position", 0)
        playMelonItem(melonItemList.get(position))
        changeThumbnail(melonItemList.get(position))

        playPauseButton = findViewById(R.id.play)
        playPauseButton.setOnClickListener {
            if (is_playing == true) {
                is_playing = false
                mediaPlayer.stop()
            }
            else{
                is_playing = true
                playMelonItem(melonItemList.get(position))
            }

        }
        findViewById<ImageView>(R.id.back).setOnClickListener{
            mediaPlayer.stop()
            position -= 1
            playMelonItem(melonItemList.get(position))
            changeThumbnail(melonItemList.get(position))
        }
        findViewById<ImageView>(R.id.next).setOnClickListener{
            mediaPlayer.stop()

            position += 1
            playMelonItem(melonItemList.get(position))
            changeThumbnail(melonItemList.get(position))
        }

    }

    fun playMelonItem(melonItem: MelonItem){
        mediaPlayer = MediaPlayer.create(
            this,
            Uri.parse(melonItem.song)
        )
        mediaPlayer.start()
    }

    fun changeThumbnail(melonItem: MelonItem){
        findViewById<ImageView>(R.id.thumbnail).apply {
            val glide = Glide.with(this@MelonDetailActivity)
            glide.load(melonItem.thumbnail).into(this)
        }
    }
}