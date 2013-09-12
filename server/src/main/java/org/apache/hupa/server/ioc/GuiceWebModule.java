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

package org.apache.hupa.server.ioc;

import org.apache.hupa.server.servlet.DownloadAttachmentServlet;
import org.apache.hupa.server.servlet.MessageSourceServlet;
import org.apache.hupa.server.servlet.UploadAttachmentServlet;
import org.apache.hupa.shared.SConsts;

import com.google.inject.Singleton;
import com.google.inject.servlet.ServletModule;

=======
package org.apache.hupa.server.ioc;

import com.google.inject.Singleton;
import com.google.inject.servlet.ServletModule;

/**
 */
>>>>>>> Make chechsession and login work with RF, with refactoring fetch folders.
public class GuiceWebModule extends ServletModule {
  
  @Override
  protected void configureServlets() {

    bind(IocRfServlet.class).in(Singleton.class);
    serve("/gwtRequest").with(IocRfServlet.class);
<<<<<<< HEAD
    serve("/" + SConsts.HUPA + SConsts.SERVLET_DOWNLOAD).with(DownloadAttachmentServlet.class);
    serve("/" + SConsts.HUPA + SConsts.SERVLET_UPLOAD).with(UploadAttachmentServlet.class);
    serve("/" + SConsts.HUPA + SConsts.SERVLET_SOURCE).with(MessageSourceServlet.class);
=======
>>>>>>> Make chechsession and login work with RF, with refactoring fetch folders.
  }
}
