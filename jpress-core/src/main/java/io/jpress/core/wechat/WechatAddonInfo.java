/**
 * Copyright (c) 2016-2019, Michael Yang 杨福海 (fuhai999@gmail.com).
 * <p>
 * Licensed under the GNU Lesser General Public License (LGPL) ,Version 3.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.gnu.org/licenses/lgpl-3.0.txt
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.jpress.core.wechat;

import io.jboot.utils.ClassKits;

/**
 * @author Michael Yang 杨福海 （fuhai999@gmail.com）
 * @version V1.0
 * @Package io.jpress.core.wechat
 */
public class WechatAddonInfo {

    private String id;
    private String title;
    private String description;
    private String author;
    private String authorWebsite;
    private String version;
    private String updateUrl;
    private String addonClazz;

    private int versionCode;

    public WechatAddonInfo() {
    }

    public WechatAddonInfo(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthorWebsite() {
        return authorWebsite;
    }

    public void setAuthorWebsite(String authorWebsite) {
        this.authorWebsite = authorWebsite;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getUpdateUrl() {
        return updateUrl;
    }

    public void setUpdateUrl(String updateUrl) {
        this.updateUrl = updateUrl;
    }

    public String getAddonClazz() {
        return addonClazz;
    }

    public void setAddonClazz(String addonClazz) {
        this.addonClazz = addonClazz;
    }

    public int getVersionCode() {
        return versionCode;
    }

    public void setVersionCode(int versionCode) {
        this.versionCode = versionCode;
    }

    private WechatAddon addon;

    public WechatAddon getAddon() {
        if (addon == null) {
            addon = ClassKits.newInstance(addonClazz);
        }
        return addon;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof WechatAddonInfo)) {
            return false;
        }

        WechatAddonInfo addon = (WechatAddonInfo) obj;
        if (addon == null || addon.getId() == null) {
            return false;
        }

        return addon.getId().equals(getId());
    }

    public boolean isEnable() {
        return WechatAddonManager.me().isEnable(this);
    }
}
