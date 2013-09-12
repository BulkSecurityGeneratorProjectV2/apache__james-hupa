/****************************************************************
 * Licensed to the Apache Software Foundation (ASF) under one   *
 * or more contributor license agreements.  See the NOTICE file *
 * distributed with this work for additional information        *
 * regarding copyright ownership.  The ASF licenses this file   *
 * to you under the Apache License, Version 2.0 (the            *
 * "License"); you may not use this file except in compliance   *
 * with the License.  You may obtain a copy of the License at   *
 *                                                              *
 *   http://www.apache.org/licenses/LICENSE-2.0                 *
 *                                                              *
 * Unless required by applicable law or agreed to in writing,   *
 * software distributed under the License is distributed on an  *
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY       *
 * KIND, either express or implied.  See the License for the    *
 * specific language governing permissions and limitations      *
 * under the License.                                           *
 ****************************************************************/

package org.apache.hupa.client.mapper;

import org.apache.hupa.client.activity.TopBarActivity;

import com.google.gwt.activity.shared.Activity;
<<<<<<< HEAD
<<<<<<< HEAD
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
=======
import com.google.gwt.activity.shared.ActivityMapper;
<<<<<<< HEAD
>>>>>>> integrate all of the views to their corresponding activities and mappers
=======
=======
>>>>>>> try to fix some issues by reorganize the activity mapper and place controller
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
>>>>>>> support code split
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
public class TopBarActivityMapper extends _HupaActivityMapper {
=======
public class TopBarActivityMapper implements ActivityMapper {
>>>>>>> integrate all of the views to their corresponding activities and mappers
=======
public class TopBarActivityMapper extends AbstractActivityMapper {
>>>>>>> try to fix some issues by reorganize the activity mapper and place controller
=======
public class TopBarActivityMapper extends MainActivityMapper {
>>>>>>> fixed issue#11, write a subclass of SplitLayoutPanel to override its onResize but failed, use the native one, and then refactor some names
	private final Provider<TopBarActivity> topBarActivityProvider;

	@Inject
	public TopBarActivityMapper(Provider<TopBarActivity> topActivityProvider) {
		this.topBarActivityProvider = topActivityProvider;
	}

<<<<<<< HEAD
<<<<<<< HEAD
	@Override
	Activity asyncLoadActivity(final Place place) {
		return new ActivityAsyncProxy() {
			@Override
			protected void doAsync(RunAsyncCallback callback) {
				GWT.runAsync(callback);
			}

			@Override
			protected Activity createInstance() {
				return topBarActivityProvider.get();
			}
		};
=======
	public Activity getActivity(Place place) {
<<<<<<< HEAD
		return topBarActivityProvider.get();
>>>>>>> integrate all of the views to their corresponding activities and mappers
=======
=======
	@Override
<<<<<<< HEAD
<<<<<<< HEAD
	Activity getAppActivity(Place place) {
>>>>>>> try to fix some issues by reorganize the activity mapper and place controller
=======
	Activity getAppActivity(final Place place) {
>>>>>>> fixed issue#46 and issue#32
=======
	Activity asyncLoadActivity(final Place place) {
>>>>>>> fixed issue#11, write a subclass of SplitLayoutPanel to override its onResize but failed, use the native one, and then refactor some names
		return new ActivityAsyncProxy() {
			@Override
			protected void doAsync(RunAsyncCallback callback) {
				GWT.runAsync(callback);
			}

			@Override
			protected Activity createInstance() {
				return topBarActivityProvider.get();
			}
		};
>>>>>>> support code split
	}
}
