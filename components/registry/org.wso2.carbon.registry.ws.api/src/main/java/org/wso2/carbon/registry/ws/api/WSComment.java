/*
*  Copyright (c) 2005-2010, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
*
*  WSO2 Inc. licenses this file to you under the Apache License,
*  Version 2.0 (the "License"); you may not use this file except
*  in compliance with the License.
*  You may obtain a copy of the License at
*
*    http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing,
* software distributed under the License is distributed on an
* "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
* KIND, either express or implied.  See the License for the
* specific language governing permissions and limitations
* under the License.
*/
package org.wso2.carbon.registry.ws.api;

/**
 * The WSComment class is a web service compatible representation of the Comment class.
 */
public class WSComment {

    /**
     * Unique path of the resource within the registry. This is generated by appending all
     * ascendant paths to the resource name separated by "/". For example assume that the resource
     * name is "users.xml". config.xml if inside the collection named "config". config collection
     * is inside the root level collection named "servers". Then the path of the resource is
     * /servers/config/users.xml.
     */
    private transient String Path;
    
    /**
     * Path of the comment. Each comment has a path in the form /projects/esb/config.xml;comments:12
     *
     */
    private transient String commentPath;

    /**
     * Comment text. This may contain any string inclusing HTML segments.
     */
    private transient String text;

    /**
     * Username of the user who added this comment.
     */
    private transient String user;

    /**
     * Date and time at which this comment is added.
     */
    private transient long time;

    /**
     * Path of the resource on which this comment is made.
     */
    private transient String resourcePath;

    /**
     * the id unique to the comment
     */
    private transient long commentID;

    public WSComment() {
    }

    public String getCommentPath() {
        return commentPath;
    }

    public void setCommentPath(String commentPath) {
        this.commentPath = commentPath;
    }

    /**
     * Returns the comment text
     * @return text
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the comment text
     * @param text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     * Get the user who made this comment
     * @return user
     */
    public String getUser() {
        return user;
    }

    /**
     * Set the user of this comment
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * Get time the comment was made
     * @return time as a long integer value
     */
    public long getTime() {
        return time;
    }

    /**
     * Set time as a long integer value
     * @param time
     */
    public void setTime(long time) {
        this.time = time;
    }
    
    /**
     * Get the path of the resource that this comment belongs to
     * @return resource path
     */
    public String getResourcePath() {
        return resourcePath;
    }

    /**
     * Set the path of the resource that this comment belongs to
     * @param resourcePath
     */
    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    /**
     * Get the ID of the comment
     * @return comment ID
     */
    public long getCommentID() {
        return commentID;
    }

    /**
     * Set comment ID
     * @param commentID
     */
    public void setCommentID(long commentID) {
        this.commentID = commentID;
    }

    public String getPath() {
        return Path;
    }

    public void setPath(String path) {
        Path = path;
    }

}
