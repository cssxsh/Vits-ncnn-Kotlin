package xyz.cssxsh.vits

//import android.content.res.AssetManager

public object Vits {
    init {
        Library.staticLoad()
    }

//    external fun init_vits(assetManager: AssetManager, path: String, voice_convert: Boolean, multi: Boolean, n_vocab: Int): Boolean
//
//    external fun forward(
//        x: IntArray,
//        vulkan: Boolean,
//        multi: Boolean,
//        sid: Int,
//        noise_scale: Float,
//        noise_scale_w: Float,
//        length_scale: Float,
//        num_threads: Int
//    ): FloatArray?
//
//    external fun voice_convert(
//        audio: FloatArray, raw_sid: Int, target_sid: Int,
//        vulkan: Boolean, num_threads: Int
//    ): FloatArray
//
}