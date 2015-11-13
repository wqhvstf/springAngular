<div class="input-append">
	<input style="width: 358px; margin-left: 100px;" class="span2" type="text" ng-model="userName" />
	<button class="btn btn-primary" ng-disabled="!userName" ng-click="addNewUser(userName)">Add User</button>
</div>

<h3 style="margin-left: 100px;">User List</h3>
<div class="alert alert-info" style="width: 400px; margin-left: 100px;" ng-show="users.length == 0">No users found</div>

<table class="table table-bordered table-striped" style="width: 450px; margin-left: 100px;" ng-show="users.length > 0">
	<thead>
		<tr>
			<th style="text-align: center; width: 25px;">Action</th>
			<th style="text-align: center;">User Name</th>
		</tr>
	</thead>
	<tbody>
		<tr ng-repeat="user in users">
			<td style="width: 70px; text-align: center;"><button class="btn btn-mini btn-danger" ng-click="removeUser(user)">Remove</button></td>
			<td>{{user}}</td>
		</tr>
	</tbody>
</table>

<button style="margin-left: 100px;" class="btn btn-danger" ng-show="users.length > 1" ng-click="removeAllUsers()">Remove
	All Users</button>