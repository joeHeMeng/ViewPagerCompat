/*
 * Copyright (C) 2014 Peng fei Pan <sky@xiaopan.me>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.xiaopan.compatviewpager.sample;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ArrayAdapter;

public class ListTextFragment extends ListFragment {
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        ArrayAdapter adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, new String[]{
                "1"
                ,"2"
                ,"3"
                ,"4"
                ,"5"
                ,"6"
                ,"7"
                ,"8"
                ,"9"
                ,"10"
                ,"11"
                ,"12"
                ,"13"
                ,"14"
                ,"15"
                ,"16"
                ,"17"
                ,"18"
                ,"19"
                ,"20"
                ,"21"
                ,"22"
                ,"23"
                ,"24"
                ,"25"
                ,"26"
                ,"27"
                ,"28"
                ,"29"
        });

        getListView().setAdapter(adapter);
            setListShown(true);

    }
}
