/*
 * Copyright (C) 2020-2022, TenX-OS
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tenx.support.preferences;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.preference.Preference;

import com.tenx.support.R;

public class TenXPreference extends Preference {

    public TenXPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public TenXPreference(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    public TenXPreference(Context context) {
        super(context);
    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray b = context.obtainStyledAttributes(attrs, R.styleable.PreferenceLayout);
        int position = b.getInt(R.styleable.PreferenceLayout_position, 4);
        b.recycle();

        switch (position) {
            case 0: // Top
                setLayoutResource(R.layout.tenx_preference_top);
                break;
            case 1: // Middle
                setLayoutResource(R.layout.tenx_preference_middle);
                break;
            case 2: // Bottom
                setLayoutResource(R.layout.tenx_preference_bottom);
                break;
            case 3: // Full
                setLayoutResource(R.layout.tenx_preference);
                break;
            case 4: // None
                return;
        }
    }
}
