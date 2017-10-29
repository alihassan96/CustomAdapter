package com.example.ali_pc.madassign1;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Ali-pc on 10/2/2017.
 */

public class ContactAdapter extends ArrayAdapter<Contacts> {

    class ViewHolder {
        TextView tvName;
        TextView tvPhone;
        TextView tvGender;
    }

    private static final String TAG = "MTAG";

    public ContactAdapter(@NonNull Context context, @NonNull List<Contacts> objects) {
        super(context, 0, objects);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull final ViewGroup parent) {
        Log.d(TAG, "convertview : " + convertView);
        View view = convertView;
        ViewHolder vh;
        Contacts c = getItem(position);

        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.contact_list, parent, false);

            TextView tvName = (TextView) view.findViewById(R.id.tvName);
            TextView tvPhone = (TextView) view.findViewById(R.id.tvPhone);
            TextView tvGender = (TextView) view.findViewById(R.id.tvGender);

            ImageButton b1 = (ImageButton) view.findViewById(R.id.btn1);
            b1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    Intent CallIntent = new Intent(Intent.ACTION_CALL, Uri.parse("tel: 012239287 "));

                    if (ActivityCompat.checkSelfPermission(getContext(), Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
                        // TODO: Consider calling
                        //    ActivityCompat#requestPermissions
                        // here to request the missing permissions, and then overriding
                        //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
                        //                                          int[] grantResults)
                        // to handle the case where the user grants the permission. See the documentation
                        // for ActivityCompat#requestPermissions for more details.
                        return;
                    }
                    parent.getContext().startActivity(CallIntent);


                }
            });


            vh = new ViewHolder();
            vh.tvName = tvName;
            vh.tvPhone = tvPhone;
            vh.tvGender = tvGender;

            view.setTag(vh);
        }

        vh = (ViewHolder) view.getTag();

        vh.tvName.setText(c.getFname());
        vh.tvPhone.setText(c.getFphone());
        vh.tvGender.setText(c.getFgender());


        return view;
    }


}