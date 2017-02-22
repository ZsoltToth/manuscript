indexApp.controller('submissionController', ['$scope', '$http',
	function ($scope, $http) {
		$scope.uploadFiles = function () {
			var file = $scope.myFile;
			var formdata = new FormData();
			formdata.append('file', file);

			$http({
				transformRequest: angular.identity,
				method: 'POST',
				url: 'submission/uploadFile',
				headers: { 'Content-Type': undefined },
				data: formdata
			}).then(function successCallback(response) {
				console.log("success: ", response);
			}, function errorCallback(response) {
				console.log("error: ", response);
			})
		};
	}]);