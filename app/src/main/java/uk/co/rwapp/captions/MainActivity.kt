package uk.co.rwapp.captions

import android.media.MediaFormat
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        videoView.setVideoURI(Uri.parse("android.resource://uk.co.rwapp.captions/" + R.raw.wcag));
        val subtitlesEN = resources.openRawResource(R.raw.subs_en_vtt)
        videoView.addSubtitleSource(subtitlesEN, MediaFormat.createSubtitleFormat("text/vtt", Locale.ENGLISH.language))
        videoView.start()
    }
}