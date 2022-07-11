import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.saido.myapplication.R
import dev.saido.myapplication.Twitteritem

class TwitterAdapter(var TwitterList: List<Twitteritem>): RecyclerView.Adapter<TwitterViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwitterViewHolder {
        var itemView=
            LayoutInflater.from(parent.context).inflate(R.layout.twitter_list_item,parent,false)
        return TwitterViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: TwitterViewHolder, position: Int) {
        var currentTwitter=TwitterList.get(position)
        holder.tvname.text=currentTwitter.name
        holder.tvHandle.text=currentTwitter.handle
        holder.tvTweet.text=currentTwitter.tweet
        holder.tvHour.text=currentTwitter.time

    }

    override fun getItemCount(): Int {
        return  TwitterList.size

    }


}

class TwitterViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    var tvname=itemView.findViewById<TextView>(R.id.tvName)
    var tvHandle=itemView.findViewById<TextView>(R.id.tvhandle)
    var tvHour=itemView.findViewById<TextView>(R.id.tvtime)
    var tvTweet=itemView.findViewById<TextView>(R.id.tvText)
    var tvIMAGE=itemView.findViewById<ImageView>(R.id.iv1)

}