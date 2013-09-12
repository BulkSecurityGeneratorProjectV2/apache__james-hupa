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

import org.apache.hupa.client.activity.MessageListActivity;
<<<<<<< HEAD
<<<<<<< HEAD
import org.apache.hupa.client.place.FolderPlace;
import org.apache.hupa.client.place.MessagePlace;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.core.client.GWT;
import com.google.gwt.core.client.RunAsyncCallback;
=======
=======
import org.apache.hupa.client.place.DefaultPlace;
import org.apache.hupa.client.place.MailFolderPlace;
>>>>>>> make message list view panel work as expected partly

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
>>>>>>> integrate all of the views to their corresponding activities and mappers
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;

<<<<<<< HEAD
public class MessageListActivityMapper extends _MessageActivityMapper {
=======
public class MessageListActivityMapper implements ActivityMapper {
>>>>>>> integrate all of the views to their corresponding activities and mappers
	private final Provider<MessageListActivity> messageListActivityProvider;

	@Inject
	public MessageListActivityMapper(Provider<MessageListActivity> messageListActivityProvider) {
		this.messageListActivityProvider = messageListActivityProvider;
	}

<<<<<<< HEAD
	@Override
	protected Activity lazyLoadActivity(final Place place) {
		if (place instanceof FolderPlace) {
			return messageListActivityProvider.get().with(((FolderPlace) place).getToken());
		} else if(place instanceof MessagePlace){
			return messageListActivityProvider.get().with(((MessagePlace) place).getTokenWrapper().getFolder());
		}
		return new ActivityAsyncProxy() {
			@Override
			protected void doAsync(RunAsyncCallback callback) {
				GWT.runAsync(callback);
			}

			@Override
			protected Activity createInstance() {
				if (place instanceof FolderPlace) {
					return messageListActivityProvider.get().with(((FolderPlace) place).getToken());
				} else if(place instanceof MessagePlace){
					return messageListActivityProvider.get().with(((MessagePlace) place).getTokenWrapper().getFolder());
				}
				return messageListActivityProvider.get();
			}
		};
=======
	public Activity getActivity(Place place) {
		if(place instanceof DefaultPlace)return null;
		else if (place instanceof MailFolderPlace) return messageListActivityProvider.get().with((MailFolderPlace)place);
		return messageListActivityProvider.get();
>>>>>>> integrate all of the views to their corresponding activities and mappers
	}
}
