package com.example.snap_develop.view.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.snap_develop.MyDebugTree;
import com.example.snap_develop.R;
import com.example.snap_develop.bean.UserBean;
import com.example.snap_develop.view.ui.UserActivity;
import com.example.snap_develop.view.view_holder.ApplicatedFollowListViewHolder;

import java.util.List;

import timber.log.Timber;

public class ApplicatedFollowListAdapter extends RecyclerView.Adapter<ApplicatedFollowListViewHolder> {

    private final Context mContext;
    private final List<UserBean> mFollowList;

    public ApplicatedFollowListAdapter(Context context, List<UserBean> followList) {
        Timber.i(MyDebugTree.START_LOG);
        Timber.i(String.format("%s %s=%s, %s=%s", MyDebugTree.INPUT_LOG, "context", context, "followList", followList));

        this.mContext = context;
        this.mFollowList = followList;
    }


    @NonNull
    @Override
    public ApplicatedFollowListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Timber.i(MyDebugTree.START_LOG);
        Timber.i(String.format("%s %s=%s, %s=%s", MyDebugTree.INPUT_LOG, "parent", parent, "viewType", viewType));

        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_applicated_follow_list_item,
                parent, false);
        return new ApplicatedFollowListViewHolder(inflate);
    }


    @Override
    public void onBindViewHolder(@NonNull ApplicatedFollowListViewHolder holder, final int position) {
        Timber.i(MyDebugTree.START_LOG);
        Timber.i(String.format("%s %s=%s, %s=%s", MyDebugTree.INPUT_LOG, "holder", holder, "position", position));

        final UserBean userBean = mFollowList.get(position);
        holder.mIconImageView.setImageBitmap(userBean.getIcon());
        holder.mUserNameTextView.setText(userBean.getName());
        holder.mUserIdTextView.setText(userBean.getUid());

        holder.mConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mContext.startActivity(new Intent(mContext, UserActivity.class).putExtra("uid", userBean.getUid()));
            }
        });
    }


    @Override
    public int getItemCount() {
        Timber.i(MyDebugTree.START_LOG);
        return mFollowList.size();
    }
}
