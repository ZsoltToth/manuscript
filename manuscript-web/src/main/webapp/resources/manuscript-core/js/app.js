var app = angular.module("app", []);

app.controller('mainCtrl', ['$scope', '$http', function($scope, $http){
	$scope.error = "";
	$scope.user = {
			firstName : "first name",
			lastName : "last name",
			userName: "user name",
			password: "password",
//			birthDate: "",
			personalDescription: "personalDescription",
//			registrationDate: "",
			email: "email@gmail.com",
			phoneNumber: "+36305555555"
	}
    $scope.addNewUser = function(data, status, headers, config){
    	
    	
        $http.post('registration/create', JSON.stringify($scope.user)).success(function(data, status, headers, config){
            console.log('SUCCES DATA: ',data);
            $scope.error = data.messages;
        }).error(function(data, status, headers, config){
            console.log('ERROR: ',data, status, headers, config)
        });
    };

}]);