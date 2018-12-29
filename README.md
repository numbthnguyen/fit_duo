# Fit Duo

One Paragraph of project description goes here

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

### Cloning Project

Go to desired directory 

```
git clone https://github.com/numbthnguyen/android-app.git
```

### Deploy SSH Keys

For Linux 

```
cd ~                     #Your home directory
ssh-keygen -t rsa        #Press enter for all values
cat ~/.ssh/id_rsa.pub    #Copy contents including ssh-rsa
```
For Windows

```
Use Putty Gen to generate a key
Export the key as an open SSH key
```

* If it is a GitHub repository and you have administrative privileges, go to settings and click 'add SSH key'. Copy the contents of your ~/.ssh/id_rsa.pub into the field labeled 'Key'.
* If your repository is administered by somebody else, give the administrator your id_rsa.pub.
* If your remote repository is administered by your, you can use this command for example:
```
scp ~/.ssh/id_rsa.pub YOUR_USER@YOUR_IP:~/.ssh/authorized_keys/id_rsa.pub
```
If you have done the steps above and are still getting the password prompt, make sure your repo URL is in the form

```
git+ssh://git@github.com/username/reponame.git
```
as opposed to

```
https://github.com/username/reponame.git
```
To see your repo URL, run:

```
git remote show origin
```
You can change the URL with:

```
git remote set-url origin git+ssh://git@github.com/username/reponame.git
```
### Using Git 

Make sure you're in the project directory, verify with git status.
```
git add .
git commit -am "Your commit message"
git pull origin master
git push origin master
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* [Android Studio](https://developer.android.com/studio/) - The web framework used
* [Firebase](https://firebase.google.com/) - Database 

## Authors

* **Tuan Nguyen** - *Initial work* - [numbthnguyen](https://github.com/numbthnguyen)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone whose code was used
* Inspiration
* etc
