<<<<<<< HEAD
<<<<<<< HEAD
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

package org.apache.hupa.client.activity;

import org.apache.hupa.client.HupaConstants;
import org.apache.hupa.client.rf.IdleRequest;
import org.apache.hupa.client.rf.LogoutUserRequest;
import org.apache.hupa.client.ui.WidgetDisplayable;
import org.apache.hupa.shared.domain.IdleAction;
import org.apache.hupa.shared.domain.IdleResult;
import org.apache.hupa.shared.domain.LogoutUserResult;
import org.apache.hupa.shared.domain.User;
=======
=======
>>>>>>> introduce the top activity
package org.apache.hupa.client.activity;

import org.apache.hupa.client.HupaConstants;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
import org.apache.hupa.client.evo.HupaEvoCallback;
import org.apache.hupa.client.place.DefaultPlace;
import org.apache.hupa.client.ui.WidgetDisplayable;
import org.apache.hupa.shared.data.User;
>>>>>>> introduce the top activity
=======
import org.apache.hupa.client.HupaEvoCallback;
import org.apache.hupa.client.mvp.WidgetDisplayable;
=======
import org.apache.hupa.client.evo.HupaEvoCallback;
>>>>>>> Make the evo more clear.
import org.apache.hupa.client.place.DefaultPlace;
import org.apache.hupa.client.ui.WidgetDisplayable;
import org.apache.hupa.shared.data.User;
>>>>>>> introduce the top activity
=======
import org.apache.hupa.client.place.DefaultPlace;
import org.apache.hupa.client.ui.WidgetDisplayable;
import org.apache.hupa.shared.domain.User;
>>>>>>> Make chechsession and login work with RF, with refactoring fetch folders.
import org.apache.hupa.shared.events.FlashEvent;
import org.apache.hupa.shared.events.FlashEventHandler;
import org.apache.hupa.shared.events.LoginEvent;
import org.apache.hupa.shared.events.LoginEventHandler;
import org.apache.hupa.shared.events.LogoutEvent;
import org.apache.hupa.shared.events.LogoutEventHandler;
import org.apache.hupa.shared.events.ServerStatusEvent;
import org.apache.hupa.shared.events.ServerStatusEvent.ServerStatus;
import org.apache.hupa.shared.events.ServerStatusEventHandler;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

=======
=======
>>>>>>> introduce the top activity
import org.apache.hupa.shared.rpc.CheckSession;
import org.apache.hupa.shared.rpc.CheckSessionResult;
import org.apache.hupa.shared.rpc.Idle;
import org.apache.hupa.shared.rpc.IdleResult;
import org.apache.hupa.shared.rpc.LogoutUser;
import org.apache.hupa.shared.rpc.LogoutUserResult;
=======
>>>>>>> Make chechsession and login work with RF, with refactoring fetch folders.

import com.google.gwt.activity.shared.AbstractActivity;
<<<<<<< HEAD
>>>>>>> introduce the top activity
=======
>>>>>>> introduce the top activity
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.HasClickHandlers;
import com.google.gwt.event.shared.EventBus;
<<<<<<< HEAD
<<<<<<< HEAD
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.HasText;
import com.google.inject.Inject;
import com.google.web.bindery.requestfactory.shared.Receiver;

public class TopActivity extends AppBaseActivity {

	private static final int IDLE_INTERVAL = 150000;

=======
=======
>>>>>>> introduce the top activity
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.user.client.Timer;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.google.gwt.user.client.ui.HasText;
import com.google.inject.Inject;
<<<<<<< HEAD
<<<<<<< HEAD
import com.google.inject.Provider;
=======
>>>>>>> introduce the top activity
=======
import com.google.inject.Provider;
>>>>>>> 

public class TopActivity extends AbstractActivity {

	private static final int IDLE_INTERVAL = 150000;
<<<<<<< HEAD
	HupaConstants constants;
<<<<<<< HEAD
>>>>>>> introduce the top activity
=======
>>>>>>> introduce the top activity
=======
>>>>>>> fix issue 2&3. 	Handle exceptions thrown in async blocks & Simply injection code
	@Override
	public void start(AcceptsOneWidget container, EventBus eventBus) {
		container.setWidget(display.asWidget());
		bind();
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
		checkSession();
>>>>>>> introduce the top activity
=======
		checkSession();
>>>>>>> introduce the top activity
=======
//		checkSession();
>>>>>>> Make chechsession and login work with RF, with refactoring fetch folders.
	}

	private void bind() {
		eventBus.addHandler(LoginEvent.TYPE, new LoginEventHandler() {
			public void onLogin(LoginEvent event) {
				user = event.getUser();
				display.getUserText().setText(event.getUser().getName());
				noopTimer.scheduleRepeating(IDLE_INTERVAL);
				showMain(user);
				display.showMessage(constants.welcome(), 3000);
			}
<<<<<<< HEAD
<<<<<<< HEAD
		});
		eventBus.addHandler(LogoutEvent.TYPE, new LogoutEventHandler() {
=======
=======
>>>>>>> introduce the top activity

		});
		eventBus.addHandler(LogoutEvent.TYPE, new LogoutEventHandler() {

<<<<<<< HEAD
>>>>>>> introduce the top activity
=======
>>>>>>> introduce the top activity
			public void onLogout(LogoutEvent event) {
				User u = event.getUser();
				String username = null;
				if (u != null) {
					username = u.getName();
				}
				showLogin(username);
				noopTimer.cancel();
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
				TopActivity.this.placeController.goTo(defaultPlaceProvider.get());
			}
<<<<<<< HEAD
		});
		registerHandler(display.getLogoutClick().addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				doLogout();
			}
		}));
		registerHandler(display.getContactsClick().addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				showContacts();
			}
		}));
		registerHandler(display.getMainClick().addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				showMain(user);
			}
		}));
		eventBus.addHandler(ServerStatusEvent.TYPE, new ServerStatusEventHandler() {
=======
=======
=======
				TopActivity.this.placeController.goTo(defaultPlaceProvider.get());
>>>>>>> 
=======
//				TopActivity.this.placeController.goTo(defaultPlaceProvider.get());
>>>>>>> Make chechsession and login work with RF, with refactoring fetch folders.
			}
>>>>>>> introduce the top activity

		});
		display.getLogoutClick().addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {
				doLogout();
			}

		});
		display.getContactsClick().addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {
				showContacts();
			}

		});
		display.getMainClick().addClickHandler(new ClickHandler() {

			public void onClick(ClickEvent event) {
				showMain(user);
			}

		});
		eventBus.addHandler(ServerStatusEvent.TYPE, new ServerStatusEventHandler() {

<<<<<<< HEAD
>>>>>>> introduce the top activity
=======
>>>>>>> introduce the top activity
			public void onServerStatusChange(ServerStatusEvent event) {
				if (event.getStatus() != serverStatus) {
					GWT.log("Server status has hanged from " + serverStatus + " to" + event.getStatus(), null);
					serverStatus = event.getStatus();
					display.setServerStatus(serverStatus);
				}
			}
<<<<<<< HEAD
<<<<<<< HEAD
		});
		eventBus.addHandler(FlashEvent.TYPE, new FlashEventHandler() {
			public void onFlash(FlashEvent event) {
				display.showMessage(event.getMessage(), event.getMillisec());
			}
		});
	}

	private void doLogout() {
		if (user != null) {
			LogoutUserRequest req = rf.logoutRequest();
			req.logout().fire(new Receiver<LogoutUserResult>() {
				@Override
				public void onSuccess(LogoutUserResult response) {
					eventBus.fireEvent(new LogoutEvent(response.getUser()));
=======
=======
>>>>>>> introduce the top activity

		});
		eventBus.addHandler(FlashEvent.TYPE, new FlashEventHandler() {

			public void onFlash(FlashEvent event) {
				display.showMessage(event.getMessage(), event.getMillisec());
			}

		});
	}

	private void checkSession() {
		System.out.println("+++++++++++++");
//		dispatcher.execute(new CheckSession(), new AsyncCallback<CheckSessionResult>() {
//			public void onFailure(Throwable caught) {
//				serverStatus = ServerStatus.Unavailable;
//				display.setServerStatus(serverStatus);
//				showLogin(null);
//			}
//			public void onSuccess(CheckSessionResult result) {
//				serverStatus = ServerStatus.Available;
//				display.setServerStatus(serverStatus);
//				if (result.isValid()) {
//					eventBus.fireEvent(new LoginEvent(result.getUser()));
//				} else {
//					showLogin(null);
//				}
//			}
//		});
	}
	private void doLogout() {
<<<<<<< HEAD
		if (user != null) {
			dispatcher.execute(new LogoutUser(), new HupaEvoCallback<LogoutUserResult>(dispatcher, eventBus) {
				public void callback(LogoutUserResult result) {
					eventBus.fireEvent(new LogoutEvent(result.getUser()));
<<<<<<< HEAD
>>>>>>> introduce the top activity
=======
>>>>>>> introduce the top activity
				}
			});
		}
=======
//		if (user != null) {
//			dispatcher.execute(new LogoutUser(), new HupaEvoCallback<LogoutUserResult>(dispatcher, eventBus) {
//				public void callback(LogoutUserResult result) {
//					eventBus.fireEvent(new LogoutEvent(result.getUser()));
//				}
//			});
//		}
>>>>>>> Make chechsession and login work with RF, with refactoring fetch folders.
	}

	private void showMain(User user) {
		display.showTopNavigation(true);
		display.showContactsButton();
	}

	private void showLogin(String username) {
		display.showTopNavigation(false);
<<<<<<< HEAD
<<<<<<< HEAD
//		placeController.goTo(new DefaultPlace());
=======
>>>>>>> introduce the top activity
=======
>>>>>>> introduce the top activity
	}

	private void showContacts() {
		display.showTopNavigation(true);
		display.showMainButton();
	}
<<<<<<< HEAD
<<<<<<< HEAD

	private Timer noopTimer = new IdleTimer();


	@Inject private Displayable display;
	@Inject private HupaConstants constants;
	private User user;
	private ServerStatus serverStatus = ServerStatus.Available;
	
=======
	private Timer noopTimer = new IdleTimer();

	@Inject
	public TopActivity(Displayable display, EventBus eventBus, PlaceController placeController, Provider<DefaultPlace> defaultPlaceProvider,
=======
	private Timer noopTimer = new IdleTimer();

<<<<<<< HEAD
	@Inject
<<<<<<< HEAD
	public TopActivity(Displayable display, EventBus eventBus, PlaceController placeController,
>>>>>>> introduce the top activity
=======
	public TopActivity(Displayable display, EventBus eventBus, PlaceController placeController, Provider<DefaultPlace> defaultPlaceProvider,
>>>>>>> 
			HupaConstants constants, DispatchAsync dispatcher) {
		this.dispatcher = dispatcher;
		this.display = display;
		this.eventBus = eventBus;
<<<<<<< HEAD
<<<<<<< HEAD
		this.defaultPlaceProvider = defaultPlaceProvider;
=======
>>>>>>> introduce the top activity
=======
		this.defaultPlaceProvider = defaultPlaceProvider;
>>>>>>> 
		this.constants = constants;
		this.placeController = placeController;

	}
<<<<<<< HEAD
>>>>>>> introduce the top activity
=======
>>>>>>> introduce the top activity
=======
>>>>>>> fix issue 2&3. 	Handle exceptions thrown in async blocks & Simply injection code
	public interface Displayable extends WidgetDisplayable {
		public HasClickHandlers getLogoutClick();
		public HasClickHandlers getContactsClick();
		public HasClickHandlers getMainClick();
		public void showTopNavigation(boolean show);
		public void showContactsButton();
		public void showMainButton();
		public HasText getUserText();
		public void setServerStatus(ServerStatus status);
		public void showMessage(String message, int millisecs);
	}

<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
	private class IdleTimer extends Timer {
		boolean running = false;

		public void run() {
			if (!running) {
				running = true;
				IdleRequest req = rf.idleRequest();
				IdleAction action = req.create(IdleAction.class);
				req.idle(action).fire(new Receiver<IdleResult>() {

					@Override
					public void onSuccess(IdleResult response) {
=======
=======
>>>>>>> introduce the top activity
	private final Displayable display;
	private final EventBus eventBus;
	private final PlaceController placeController;
	private final DispatchAsync dispatcher;
<<<<<<< HEAD
<<<<<<< HEAD
	private final Provider<DefaultPlace> defaultPlaceProvider;
=======
>>>>>>> introduce the top activity
=======
	private final Provider<DefaultPlace> defaultPlaceProvider;
>>>>>>> 

=======
	@Inject private Displayable display;
	@Inject private EventBus eventBus;
	@Inject private PlaceController placeController;
//	@Inject private DispatchAsync dispatcher;
//	@Inject private Provider<DefaultPlace> defaultPlaceProvider;
	@Inject private HupaConstants constants;
	
>>>>>>> fix issue 2&3. 	Handle exceptions thrown in async blocks & Simply injection code
	private User user;
	private ServerStatus serverStatus = ServerStatus.Available;

	private class IdleTimer extends Timer {
		boolean running = false;
		public void run() {
			if (!running) {
				running = true;
<<<<<<< HEAD
				dispatcher.execute(new Idle(), new HupaEvoCallback<IdleResult>(dispatcher, eventBus) {
					public void callback(IdleResult result) {
<<<<<<< HEAD
>>>>>>> introduce the top activity
=======
>>>>>>> introduce the top activity
						running = false;
						// check if the server is not supporting the Idle
						// command.
						// if so cancel this Timer
<<<<<<< HEAD
<<<<<<< HEAD
						if (response.isSupported() == false) {
=======
						if (result.isSupported() == false) {
>>>>>>> introduce the top activity
=======
						if (result.isSupported() == false) {
>>>>>>> introduce the top activity
							IdleTimer.this.cancel();
						}
						// Noop
						// TODO: put code here to read new events from server
						// (new messages ...)
<<<<<<< HEAD
<<<<<<< HEAD

=======
>>>>>>> introduce the top activity
=======
>>>>>>> introduce the top activity
					}
				});
=======
//				dispatcher.execute(new Idle(), new HupaEvoCallback<IdleResult>(dispatcher, eventBus) {
//					public void callback(IdleResult result) {
//						running = false;
//						// check if the server is not supporting the Idle
//						// command.
//						// if so cancel this Timer
//						if (result.isSupported() == false) {
//							IdleTimer.this.cancel();
//						}
//						// Noop
//						// TODO: put code here to read new events from server
//						// (new messages ...)
//					}
//				});
>>>>>>> Make chechsession and login work with RF, with refactoring fetch folders.
			}
		}
	}

}
