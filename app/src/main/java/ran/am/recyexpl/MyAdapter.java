package ran.am.recyexpl;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter  extends RecyclerView.Adapter<MyAdapter.VHodr>{
    List<DemoModel> MyListData;
    LisenDo llisenDo;

    public MyAdapter(LisenDo li) {
        MyListData= new ArrayList<>();
        this.llisenDo=li;
    }

    @Override
    public VHodr onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.indivlist,parent,false);
        return new VHodr(v);
    }

    @Override
    public void onBindViewHolder(MyAdapter.VHodr holder, int position) {
        holder.t1.setText(MyListData.get(position).getS1());
        holder.t2.setText(MyListData.get(position).getS2());
    }

    @Override
    public int getItemCount() {

        return MyListData.size();
    }

    public void setData(List<DemoModel> values) {
        this.MyListData.clear();
        this.MyListData.addAll(values);
        notifyDataSetChanged();
    }

    public class VHodr extends RecyclerView.ViewHolder{
    TextView t1,t2;
    ImageView img;

    public VHodr(View itemView) {
        super(itemView);
            t1=itemView.findViewById(R.id.textView);
            t2=itemView.findViewById(R.id.textView2);
            img=itemView.findViewById(R.id.imageView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    llisenDo.iamdo(getAdapterPosition());
                }
            });
    }
}

}
