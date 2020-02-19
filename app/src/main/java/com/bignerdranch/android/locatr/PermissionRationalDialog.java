package com.bignerdranch.android.locatr;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.DialogFragment;

import java.security.Permission;

public class PermissionRationalDialog extends DialogFragment {
    private static final String TAG = PermissionRationalDialog.class.getSimpleName();
    private Context mContext;

    public PermissionRationalDialog(Context context) {
        mContext = context;
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return new AlertDialog.Builder(mContext)
                .setTitle("Permission Location required.")
                .setMessage("Permission Location required for showing pics near you!")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Log.i(TAG, "OK button onClick");
                    }
                })
                .create();
    }
}
