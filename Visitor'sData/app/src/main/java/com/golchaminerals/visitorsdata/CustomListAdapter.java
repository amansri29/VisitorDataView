package com.golchaminerals.visitorsdata;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.design.widget.Snackbar;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomListAdapter extends ArrayAdapter<VisitorsDataModel> implements View.OnClickListener{

    private ArrayList<VisitorsDataModel> dataSet;
    Context mContext;

    // View lookup cache
    private static class ViewHolder {
        TextView name;
        TextView from;
        TextView purpose;
        TextView whomToMeet;
        ImageView profileImage;
    }

    public CustomListAdapter(ArrayList<VisitorsDataModel> data, Context context) {
        super(context, R.layout.list_view_custom, data);
        this.dataSet = data;
        this.mContext=context;

    }

    @Override
    public void onClick(View v) {
        int position=(Integer) v.getTag();
        Object object= getItem(position);
        VisitorsDataModel dataModel=(VisitorsDataModel)object;

        switch (v.getId())
        {
//            case R.id.item_info:
//                Snackbar.make(v, "Release date " +dataModel.getFeature(), Snackbar.LENGTH_LONG)
//                        .setAction("No action", null).show();
//                break;
        }
    }

    private int lastPosition = -1;

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        VisitorsDataModel dataModel = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        ViewHolder viewHolder; // view lookup cache stored in tag

        final View result;

        if (convertView == null) {

            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.list_view_custom, parent, false);
            viewHolder.name = (TextView) convertView.findViewById(R.id.name);
            viewHolder.from = (TextView) convertView.findViewById(R.id.from);
            viewHolder.purpose = (TextView) convertView.findViewById(R.id.purpose);
            viewHolder.whomToMeet = (TextView) convertView.findViewById(R.id.whom_to_meet);
            viewHolder.profileImage = (ImageView) convertView.findViewById(R.id.profile_image);

            result=convertView;

            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
            result=convertView;
        }

        Animation animation = AnimationUtils.loadAnimation(mContext, (position > lastPosition) ? R.anim.up_from_bottom : R.anim.down_from_top);
        result.startAnimation(animation);
        lastPosition = position;

        byte[] decodedString = Base64.decode(dataModel.getProfileImage(), Base64.DEFAULT);
        Bitmap profileImageBitmap = BitmapFactory.decodeByteArray(decodedString, 0, decodedString.length);
        viewHolder.name.setText(dataModel.getName());
        viewHolder.purpose.setText(dataModel.getPurpose());
        viewHolder.from.setText(dataModel.getFrom());
        viewHolder.whomToMeet.setText(dataModel.getWhomToMeet());
        viewHolder.profileImage.setImageBitmap(profileImageBitmap);
//        viewHolder.info.setOnClickListener(this);
//        viewHolder.info.setTag(position);
        // Return the completed view to render on screen
        return convertView;
    }
}
