/*
package tk.taxhidinkadiri.myapplication.Main_Screen.adapter;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;



import java.util.List;

import tk.taxhidinkadiri.myapplication.DetailsActivity;
import tk.taxhidinkadiri.myapplication.Main_Screen.model.Contact;
import tk.taxhidinkadiri.myapplication.R;

public class RecylerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>  {


    private Context context;
    private List<Contact> contactList;

    public RecyclerViewAdapter(Context context, List<Contact> contactList) {
        this.context = context;
        this.contactList = contactList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.contact_row, viewGroup, false);

        return new ViewHolder(view);
    }



    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        Contact contact = contactList.get(position); // each contact object inside of our list

        viewHolder.name.setText(contact.getName());
        viewHolder.height.setText(contact.getHeight());
        viewHolder.mass.setText(contact.getMass());
    }


    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        public TextView name;
        public TextView height;
        public TextView mass;
        public ImageView iconButton;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            itemView.setOnClickListener(this);

            name = itemView.findViewById(R.id.name);
            height = itemView.findViewById(R.id.height);
            mass = itemView.findViewById(R.id.mass);

            iconButton.setOnClickListener(this);



        }

        @Override
        public void onClick(View v) {

            int position = getAdapterPosition();
            Contact contact = contactList.get(position);

            Intent intent = new Intent(context, DetailsActivity.class);
            intent.putExtra("name", contact.getName());
            intent.putExtra("height", contact.getHeight());
            intent.putExtra("mass", contact.getMass())

            context.startActivity(intent);


//            switch (v.getId()) {
//                case R.id.icon_button:
//                    Log.d("IconClicked", "onClick: " + contact.getPhoneNumber());
//                    break;
//            }


            // Log.d("Clicked", "onClick: " + contact.getName());

        }
    }



















}
*/
