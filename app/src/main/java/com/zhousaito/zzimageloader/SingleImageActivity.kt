package com.zhousaito.zzimageloader

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zhousaito.imageloader.ZZImageLoader
import kotlinx.android.synthetic.main.activity_single_image.*

class SingleImageActivity : AppCompatActivity() {
    companion object {
        val imageArray = arrayListOf<String>("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1595267426181&di=ef4dd002859251f1126a5c1f43b72d3b&imgtype=0&src=http%3A%2F%2Fpic1.16pic.com%2F00%2F51%2F75%2F16pic_5175210_b.jpg",
            "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1595267408505&di=a0d60303b6748972bb2d3c65cb5a4929&imgtype=0&src=http%3A%2F%2Fa3.att.hudong.com%2F67%2F10%2F300001190914130190105261165_950.jpg",
        "https://dss2.bdstatic.com/70cFvnSh_Q1YnxGkpoWK1HF6hhy/it/u=3425860897,3737508983&fm=26&gp=0.jpg")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_single_image)

        ZZImageLoader.load(ivSingleImage, imageArray[0])
        ZZImageLoader.load(ivSingleImage2, imageArray[1])
        ZZImageLoader.load(ivSingleImage3, imageArray[2])
    }
}