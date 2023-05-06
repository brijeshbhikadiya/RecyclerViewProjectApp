package com.example.recyclervewproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class recyclerviewadapter extends RecyclerView.Adapter<recyclerviewadapter.ViewHolder> {

    private List<recyclerview> userlist;                  //step 1 : extends  RecyclerView.Adapter<recyclerviewadapter.ViewHolder> {

    public recyclerviewadapter(List<recyclerview>userlist)
    {
        this.userlist=userlist;    //step 2 ; make a constructor.  using list<>..
    }

    @NonNull                //step 3 : alt+enter to step 1 and impliments a methods. 1.on create vieew holder
                                                                                    //2.onbinfviewholder
                                                                                    //3.getitemcount
    @Override
    public recyclerviewadapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_design,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull recyclerviewadapter.ViewHolder holder, int position) {

        int image=userlist.get(position).getImage_view_profile_pictures();
        String text1=userlist.get(position).getTextview1();   //remember this point here name of variable must be diffrent.
        String text2=userlist.get(position).getTextview2();
        String text3=userlist.get(position).getTextview3();

        holder.setData(image,text1,text2,text3);

    }

    @Override
    public int getItemCount() {
        return userlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{   //step4 : make a view holder innner class and extends  RecyclerView.ViewHolder
        ImageView imageView;
        TextView textView1;
        TextView textView2;
        TextView textView3;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.image_view_profile_pictures);
            textView1=itemView.findViewById(R.id.textview1);   //step 5 : give id for all variables.
            textView2=itemView.findViewById(R.id.textview2);
            textView3=itemView.findViewById(R.id.textview3);
        }

        public void setData(int image, String text1, String text2, String text3) {
            imageView.setImageResource(image);
            textView1.setText(text1);
            textView2.setText(text2);   //step 6: set all Data..
            textView3.setText(text3);
        }
    }
}
