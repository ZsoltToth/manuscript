angular.module('webApp')
.controller('registrationController', ['$scope', '$http', function($scope, $http){
	$scope.error = "";
	$scope.user = {
			firstName : "firstname",
			lastName : "lastname",
			userName: "username",
			password: "Passwo123!rd",
			birthDate: "2013-05-12",
			personalDescription: "personalDescription",
//			registrationDate: "20",
			email: "email@gmail.com",
//			phoneNumber: "+36305555555"
	}
    $scope.addNewUser = function(data, status, headers, config){
    	
    	
        $http.post('registration/create', JSON.stringify($scope.user)).success(function(data, status, headers, config){
            console.log('SUCCES DATA: ',data);
            $scope.error = data.messages;
        }).error(function(data, status, headers, config){
            console.log('ERROR: ',data, status, headers, config)
        });
    };
}])