package com.example.recyclervewproject;

import android.content.Context;
import android.content.Intent;

public class CommonMethod {

    CommonMethod(Context context, Class<?> nextClass){
        Intent intent = new Intent(context,nextClass);
        context.startActivity(intent);
    }

}
