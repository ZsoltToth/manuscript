app.controller('loginController', ['$scope', '$http', '$location',
	function ($scope, $http, $location) {

		$scope.credential = {
			username: '',
			password: ''
		}

		$scope.authenticate = function () {
			var data = "username=" + $scope.credential.username + "&password=" + $scope.credential.password + "&submit=Login";

			$http({
				method: 'POST',
				url: 'j_spring_security_check',
				headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
				data: data
			}).then(function successCallback(response) {
				window.location = 'index.html';
				console.log("success: ", response);
			}, function errorCallback(response) {
				console.log("error: ", response);
				$scope.errorMessage = response.data.errorMessage;
				$scope.credential.username = '';
				$scope.credential.password = '';
			})
		}
	}]);