/*
package com.example.amoi.imdb.test.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

import com.example.amoi.imdb.R;

*/
/**
 * Created by amoi on 20/11/2017.
 *//*


public class Navigator {
    private final FragmentManager mFragmentManager;

    public Navigator(final FragmentManager fragmentManager) {
        mFragmentManager = fragmentManager;
    }

    public Fragment getActiveFragment() {
        if (mFragmentManager.getBackStackEntryCount() == 0) {
            return null;
        }
        String tag = mFragmentManager
                .getBackStackEntryAt(mFragmentManager.getBackStackEntryCount() - 1).getName();
        return mFragmentManager.findFragmentByTag(tag);
    }

    */
/**
     * Pushes the fragment, and add to the back stack
     *//*

    public void goTo(Fragment fragment) {
        mFragmentManager.beginTransaction()
                .addToBackStack(getName(fragment))
                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN)
                .replace(R.id.fragment_artist, fragment, getName(fragment))
                .commit();
        mFragmentManager.executePendingTransactions();
    }

    private String getName(Fragment fragment) {
        return fragment.getClass().getName();
    }

    */
/**
     * Set the new root fragment. If there is any entry in the backstack it will be deleted.
     *
     * @param startFragment the new root fragment
     *//*

    public void setRootFragment(Fragment startFragment) {
        if (getSize() > 0) {
            this.clearHistory();
        }
        this.replaceFragment(startFragment);
    }

    */
/**
     * Replace the current fragment with the given one, without to add it to backstack.
     * So when the users navigates away from the given fragment it will not appaer in
     * the history.
     *
     * @param fragment the new fragment
     *//*

    public void replaceFragment(Fragment fragment) {
        mFragmentManager.beginTransaction()
                .replace(R.id.fragment_movie, fragment, fragment.getClass().getSimpleName())
                .commit();
        mFragmentManager.executePendingTransactions();
    }

    */
/**
     * Pops the back stack
     *//*

    public void goOneFragmentBack() {
        mFragmentManager.popBackStackImmediate();
    }

    public int getSize() {
        return mFragmentManager.getBackStackEntryCount();
    }

    public boolean isEmpty() {
        return getSize() == 0;
    }

    */
/**
     * Pops to root Fragment
     *//*

    public void gotToTheStartFragmentBack() {
        for (int i = 0; i <= mFragmentManager.getBackStackEntryCount(); ++i) {
            goOneFragmentBack();
        }
    }

    public void clearHistory() {
        while (mFragmentManager.popBackStackImmediate()) ;
    }
}
*/
