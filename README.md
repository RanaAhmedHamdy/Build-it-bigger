# Build-it-bigger
This is the final project for Gradle for Android and Java course which is part of Udacity Android Nanodegree. In this project, I used Gradle to build a joke-telling app, factoring functionality into libraries and flavors to keep the build simple. I also configured a Google Cloud Endpoints development server to supply the jokes.

# Project Requirements

**Required Components**
* Project contains a Java library for supplying jokes
* Project contains an Android library with an activity that displays jokes passed to it as intent extras.
* Project contains a Google Cloud Endpoints module that supplies jokes from the Java library. Project loads jokes from GCE module via an async task. Note that this GCE module doesn't need to be deployed to a server. Local testing works fine.
* Project contains connected tests to verify that the async task is indeed loading jokes.
* Project contains paid/free flavors. The paid flavor has no ads, and no unnecessary dependencies.

**Required Behavior**
* App retrieves jokes from Google Cloud Endpoints module and displays them via an Activity from the Android Library.
* App displays ads in free flavor

# License
Copyright 2016 Rana Ahmed

Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
<pre><code>http://www.apache.org/licenses/LICENSE-2.0 </pre></code>
Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
