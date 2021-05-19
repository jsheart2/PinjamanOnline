package com.pinjamanonline;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class myadapter extends FirebaseRecyclerAdapter<model,myadapter.myviewholder>
{
    public myadapter(@NonNull FirebaseRecyclerOptions<model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull model model)
    {
        holder.nama.setText(model.getNamapemohon());
        holder.tinggal.setText(model.getAlamat());
        holder.phone.setText(model.getTelepon());
        holder.nmrktp.setText(model.getKTP());
        holder.salary.setText(model.getDuit());
        holder.modal.setText(model.getPinjaman());
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        EditText nama, tinggal, phone, nmrktp, salary, modal;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            nama     = itemView.findViewById(R.id.edtname);
            tinggal  = itemView.findViewById(R.id.edttinggal);
            phone   = itemView.findViewById(R.id.edtphone);
            nmrktp   = itemView.findViewById(R.id.edtktp);
            salary   = itemView.findViewById(R.id.edtgaji);
            modal    = itemView.findViewById(R.id.edtpinjaman);
        }
    }
}
