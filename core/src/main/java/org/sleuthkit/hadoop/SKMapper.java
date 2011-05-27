/*
   Copyright 2011 Basis Technology Corp.

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package org.sleuthkit.hadoop;

import org.apache.hadoop.mapreduce.Mapper;


public abstract class SKMapper<keyin, valin, keyout, valout>
extends Mapper<keyin, valin, keyout, valout> {

    private String id;
    public static final String ID_KEY = "org.sleuthkit.hadoop.realimageid";
    public static final String USER_ID_KEY = "org.sleuthkit.hadoop.userimageid";
    
    @Override
    public void setup(Context ctx) {
        id = ctx.getConfiguration().get(ID_KEY, "DEFAULT_IMAGE_ID");
        System.out.println(id);
    }
    

    String getId() {
        return id;
    }
    
}