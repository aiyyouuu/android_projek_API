package com.example.android_projek_api.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android_projek_api.Model.HolidayItem;
import com.example.android_projek_api.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class HolidayAdapter extends RecyclerView.Adapter<HolidayAdapter.Holder>{
    private List<HolidayItem> holidayList;
    private Context context;
    public HolidayAdapter(Context context, List<HolidayItem> holidayList) {
        this.context = context;
        this.holidayList = holidayList;
    }
    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_holiday, parent, false);
        return new Holder(view);
    }
    @Override
    public void onBindViewHolder(HolidayAdapter.Holder holder, final int
            position) {
        holder.bind(position);
    }
    @Override
    public int getItemCount() {
        return holidayList.size();
    }
    class Holder extends RecyclerView.ViewHolder {
        private RelativeLayout openEdukasi;
        private TextView tvJudul;
        private TextView tvTanggal;
        private TextView tvDate;

        public Holder(View itemView) {
            super(itemView);
            tvJudul = itemView.findViewById(R.id.tv_judul_artikel);
            tvTanggal = itemView.findViewById(R.id.tv_tanggal);
            tvDate = itemView.findViewById(R.id.tv_date);
            openEdukasi = itemView.findViewById(R.id.openEdukasi);
        }

        public void bind(final int position) {
            tvJudul.setText(holidayList.get(position).getTitle());
            tvTanggal.setText(holidayList.get(position).getPublishedAt());
            tvDate.setText(holidayList.get(position).getDate());
            openEdukasi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context, "clicked : " +
                                    tvJudul.getText().toString() + "\n Position : " + String.valueOf(position),
                            Toast.LENGTH_LONG).show();
                }
            });
        }
    }
}
