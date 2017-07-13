package com.getui.annotationsharedpreferences;

import com.yurnero.annotations.BooleanEntity;
import com.yurnero.annotations.Definition;
import com.yurnero.annotations.FloatEntity;
import com.yurnero.annotations.IntEntity;
import com.yurnero.annotations.LongEntity;
import com.yurnero.annotations.StringEntity;

/**
 * description:.
 *
 * @author：qiangjie @version：17/7/4 上午12:17
 */
@Definition(javaFileName = "MySharedPreferences", spFileName = "mysp")
public class SharedPreferencesUtils {
    @StringEntity(key = "key_name", defaultValue = "hah")
    String KEY_NAME;

    @BooleanEntity(key = "key_is_chinese", defaultValue = true)
    String KEY_IS_CHINESE;

    @IntEntity(key = "key_age", defaultValue = 16)
    String KEY_AGE;

    @FloatEntity(key = "key_hight", defaultValue = 16.6f)
    String KEY_HEIGHT;

    @LongEntity(key = "key_number", defaultValue = 188L)
    String KEY_NUMBER;
}
