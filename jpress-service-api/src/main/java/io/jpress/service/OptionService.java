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
package io.jpress.service;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.Page;
import io.jpress.model.Option;

import java.util.List;

public interface OptionService {

    /**
     * find model by primary key
     *
     * @param id
     * @return
     */
    public Option findById(Object id);


    /**
     * find all model
     *
     * @return all <Option
     */
    public List<Option> findAll();


    /**
     * delete model by primary key
     *
     * @param id
     * @return success
     */
    public boolean deleteById(Object id);


    /**
     * delete model
     *
     * @param model
     * @return
     */
    public boolean delete(Option model);


    /**
     * save model to database
     *
     * @param model
     * @return
     */
    public boolean save(Option model);


    /**
     * save or update model
     *
     * @param model
     * @return if save or update success
     */
    public boolean saveOrUpdate(Option model);


    /**
     * update data model
     *
     * @param model
     * @return
     */
    public boolean update(Option model);


    public void join(Page<? extends Model> page, String joinOnField);

    public void join(Page<? extends Model> page, String joinOnField, String[] attrs);

    public void join(Page<? extends Model> page, String joinOnField, String joinName);

    public void join(Page<? extends Model> page, String joinOnField, String joinName, String[] attrs);

    public void join(List<? extends Model> models, String joinOnField);

    public void join(List<? extends Model> models, String joinOnField, String[] attrs);

    public void join(List<? extends Model> models, String joinOnField, String joinName);

    public void join(List<? extends Model> models, String joinOnField, String joinName, String[] attrs);

    public void join(Model model, String joinOnField);

    public void join(Model model, String joinOnField, String[] attrs);

    public void join(Model model, String joinOnField, String joinName);

    public void join(Model model, String joinOnField, String joinName, String[] attrs);

    public void keep(Model model, String... attrs);

    public void keep(List<? extends Model> models, String... attrs);

    public String findByKey(String key);

    public Boolean findAsBoolByKey(String key);

    public Integer findAsIntegerByKey(String key);

    public Float findAsFloatByKey(String key);

    public boolean saveOrUpdate(String key, String value);


}