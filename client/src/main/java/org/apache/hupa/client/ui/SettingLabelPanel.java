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

package org.apache.hupa.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.SimpleLayoutPanel;
import com.google.gwt.user.client.ui.SplitLayoutPanel;
import com.google.gwt.user.client.ui.Widget;

public class SettingLabelPanel extends Composite {

	@UiField SimpleLayoutPanel labelListContainer;
	@UiField SimpleLayoutPanel labelPropertiesContainer;
	
	public SettingLabelPanel() {
		initWidget(binder.createAndBindUi(this));
	}

	public AcceptsOneWidget getLabelListView() {
		return new AcceptsOneWidget() {
			@Override
			public void setWidget(IsWidget w) {
				labelListContainer.setWidget(Widget.asWidgetOrNull(w));
			}
		};
	}

	public AcceptsOneWidget getLabelPropertiesView() {
		return new AcceptsOneWidget() {
			@Override
			public void setWidget(IsWidget w) {
				labelPropertiesContainer.setWidget(Widget.asWidgetOrNull(w));
			}
		};
	}

	interface Binder extends UiBinder<SplitLayoutPanel, SettingLabelPanel> {
	}

	private static Binder binder = GWT.create(Binder.class);
}