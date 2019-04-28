package com.kunminx.linkage;

/*
 * Copyright (c) 2018-2019. KunMinX
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.chad.library.adapter.base.BaseSectionQuickAdapter;
import com.chad.library.adapter.base.BaseViewHolder;

import java.util.List;

/**
 * Create by KunMinX at 19/4/27
 */
public class LinkageLevel2Adapter extends BaseSectionQuickAdapter<LinkageItem, BaseViewHolder> {

    public LinkageLevel2Adapter(int layoutResId, int sectionHeadResId, List<LinkageItem> data) {
        super(layoutResId, sectionHeadResId, data);
    }

    @Override
    protected void convertHead(BaseViewHolder helper, LinkageItem item) {
        helper.setText(R.id.level_2_header, item.header);
    }

    @Override
    protected void convert(BaseViewHolder helper, LinkageItem item) {
        LinkageItem.ItemInfo info = item.t;
        helper.setText(R.id.level_2_title, info.getTitle());
        helper.setText(R.id.level_2_content, info.getContent());
        helper.addOnClickListener(R.id.level_2_item);
    }
}
