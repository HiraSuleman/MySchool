package com.example.teachandtest;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class myAdapter extends RecyclerView.Adapter <myAdapter.myAdapterHolder>{
    Context context;
    List<TeachersModel> teachersModelList;
    public myAdapter(Context context, List<TeachersModel> teachersModelList){
        this.context=context;
        this.teachersModelList=teachersModelList;
    }

    @NonNull
    @Override
    public myAdapterHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.list_item_layout,parent,false);
       myAdapterHolder myAdapterHolder=new myAdapterHolder(view);
        return myAdapterHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull myAdapter.myAdapterHolder holder,int position) {
        holder.name1.setText(teachersModelList.get(position).getName());
        holder.department1.setText(teachersModelList.get(position).getDepartment());
        holder.subjects1.setText((CharSequence) teachersModelList.get(position).getSubjects());
        holder.age1.setText(teachersModelList.get(position).getAge());
        holder.gender1.setText(teachersModelList.get(position).getGender());
        holder.teacherId1.setText(teachersModelList.get(position).getTeacherId());
        holder.qualification1.setText(teachersModelList.get(position).getQualification());
        holder.cnic1.setText(teachersModelList.get(position).getCnic());

    }

    @Override
    public  int getItemCount()
    {
        return teachersModelList.size();
    }

    public class myAdapterHolder extends RecyclerView.ViewHolder{
        TextView name1;
        TextView department1;
        TextView subjects1;
        TextView age1;
        TextView gender1;
        TextView teacherId1;
        TextView qualification1;
        TextView cnic1;


        public myAdapterHolder(@NonNull View itemView) {
            super(itemView);
            name1=itemView.findViewById(R.id.name);
            department1=itemView.findViewById(R.id.dept);
            subjects1=itemView.findViewById(R.id.sub);
            gender1=itemView.findViewById(R.id.gender);
            teacherId1=itemView.findViewById(R.id.tec_id);
            qualification1=itemView.findViewById(R.id.quali);
            cnic1=itemView.findViewById(R.id.cnic);
        }
    }
}
