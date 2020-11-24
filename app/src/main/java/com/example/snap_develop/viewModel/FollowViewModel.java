package com.example.snap_develop.viewModel;

import android.util.Log;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.snap_develop.bean.UserBean;
import com.example.snap_develop.model.FollowModel;
import com.example.snap_develop.util.LogUtil;

import java.util.List;

public class FollowViewModel extends ViewModel {

    FollowModel followModel = new FollowModel();
    private MutableLiveData<List<UserBean>> followList;
    private MutableLiveData<Integer> userCount;

    public MutableLiveData<List<UserBean>> getFollowList() {
        if (followList == null) {
            followList = new MutableLiveData<>();
        }
        return followList;
    }

    public MutableLiveData<Integer> getUserCount() {
        if (userCount == null) {
            userCount = new MutableLiveData<>();
        }
        return userCount;
    }

    public void deleteApplicatedFollow(String userPath, String myUid) {
        Log.i(LogUtil.getClassName(), LogUtil.getLogMessage());
        followModel.deleteApplicatedFollow(userPath, myUid);
    }

    public void deleteApprovalPendingFollow(String userPath, String myUid) {
        Log.i(LogUtil.getClassName(), LogUtil.getLogMessage());
        followModel.deleteApprovalPendingFollow(userPath, myUid);
    }

    public void insertFollower(String userPath, String myUid) {
        Log.i(LogUtil.getClassName(), LogUtil.getLogMessage());
        followModel.insertFollower(userPath, myUid);
    }

    public void insertFollowing(String userPath, String myUid) {
        Log.i(LogUtil.getClassName(), LogUtil.getLogMessage());
        followModel.insertFollowing(userPath, myUid);
    }

    public void insertApplicatedFollow(String userPath, String myUid) {
        Log.i(LogUtil.getClassName(), LogUtil.getLogMessage());
        followModel.insertApplicatedFollow(userPath, myUid);
    }

    public void insertApprovalPendingFollow(String userPath, String myUid) {
        Log.i(LogUtil.getClassName(), LogUtil.getLogMessage());
        followModel.insertApprovalPendingFollow(userPath, myUid);
    }

    public void fetchFollowingList(String userPath) {
        Log.i(LogUtil.getClassName(), LogUtil.getLogMessage());

        followModel.fetchFollowingList(userPath, followList);
    }

    public void fetchCount(String userPath, String countPath) {
        Log.i(LogUtil.getClassName(), LogUtil.getLogMessage());

        userCount = new MutableLiveData<>();
        followModel.fetchCount(userPath, countPath, userCount);
    }
}
