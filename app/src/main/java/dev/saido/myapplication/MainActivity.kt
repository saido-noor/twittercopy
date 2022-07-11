package dev.saido.myapplication

import TwitterAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import dev.saido.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        displaytweet()
    }

    private fun displaytweet() {
        var person1=Twitteritem("saido","pascaline@kayitete","3h","Darkness is your candle","","","","")
        var person2=Twitteritem("Omar","pascaline@kayitete","2h","I am so small I can barely be seen.—\n" +
                "    I am so small I can barely be seen.\n" +
                "    How can this great love be inside me?:\n" +
                "“Look at your eyes. They are small,;\n" +
                "    But they see enormous things.","","","","",)
        var person3=Twitteritem("Omar","Omar@20","5h","You must have shadow and light source both.","","","","")









        var tweets= listOf(person1,person2,person3)
        var twitterAdapter=TwitterAdapter(tweets)
        binding.rvtweeter.layoutManager= LinearLayoutManager(this)
        binding.rvtweeter.adapter=twitterAdapter
    }
}