package org.exoplatform.addons.populator.bean;

import java.util.List;

public class PopulatorBean {
  List<UserBean> users;
  List<RelationBean> relations;
  List<SpaceBean> spaces;

  public List<UserBean> getUsers() {
    return users;
  }

  public void setUsers(List<UserBean> users) {
    this.users = users;
  }

  public List<RelationBean> getRelations() {
    return relations;
  }

  public void setRelations(List<RelationBean> relations) {
    this.relations = relations;
  }

  public List<SpaceBean> getSpaces() {
    return spaces;
  }

  public void setSpaces(List<SpaceBean> spaces) {
    this.spaces = spaces;
  }
}
