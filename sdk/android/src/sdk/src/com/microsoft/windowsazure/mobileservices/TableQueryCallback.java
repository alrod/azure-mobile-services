/*
Copyright (c) Microsoft Open Technologies, Inc.
All Rights Reserved
Apache 2.0 License
 
   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at
 
     http://www.apache.org/licenses/LICENSE-2.0
 
   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 
See the Apache Version 2.0 License for specific language governing permissions and limitations under the License.
 */
/*
 * QueryResultCallback.java
 */

package com.microsoft.windowsazure.mobileservices;

import java.util.List;

/**
 * Callback used after a query is executed
 */
public interface TableQueryCallback<E> {

	/**
	 * Method to call if the operation finishes successfully
	 * 
	 * @param result
	 *            List of entities
	 * @param count
	 *            Number of results
	 * @param exception
	 *            An exception representing the error, in case there was one
	 * @param response
	 *            Response object
	 */
	public void onCompleted(List<E> result, int count, Exception exception,
			ServiceFilterResponse response);
}
