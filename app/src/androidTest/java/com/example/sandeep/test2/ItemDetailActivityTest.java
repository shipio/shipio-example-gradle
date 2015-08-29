package com.ship.sandeep.test2;

import android.test.ActivityInstrumentationTestCase2;

public class ItemDetailActivityTest extends ActivityInstrumentationTestCase2<ItemDetailActivity> {

    private ItemDetailActivity mActivity;

    public ItemDetailActivityTest() {
        super(ItemDetailActivity.class);
    }

    public void testOnCreate() throws Exception {
//        assertEquals("fake test failure", "expected", "actual");
    }

    public void testUI() throws Exception {
        mActivity.runOnUiThread( new Runnable() {
            @Override
            public void run() {
                mActivity.findViewById(R.id.item_detail).requestFocus();
            }
        });

        Thread.sleep(5000);
    }

    @Override protected void setUp() throws Exception {
        super.setUp();

        mActivity = getActivity();

    }
}
