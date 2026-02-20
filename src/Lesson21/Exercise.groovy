package Lesson21

import groovy.transform.ToString

@ToString
class Tweet{
    String ownerName
    String text
    Date createdAt

    private List favorites = []
    private List retweets = []
    private List mentions = []
    private List hashtagas = []

    void favorite(String username){
        favorites << username
    }

    List getFavorites() {
        return favorites
    }

    void retweet(String username){
        retweets << username
    }

    List getRetweets() {
        return retweets
    }

    List getMentions() {
        String pattern = $/\B@[a-z0-9_-]+/$
        text.findAll(pattern)
    }

    List getHashtagas() {
        String pattern = ~/(?:\s|\A)[##]+([A-Za-z0-9-_]+)/
        text.findAll(pattern)
    }
}

Tweet t = new Tweet(ownerName: "@tutu", text: "This Groovy Course from @tutu is awesome! #Java #groovylang", createdAt: new Date())
println(t)

t.favorite("@ApacheGroovy")
t.retweet("@ApacheGroovy")

println(t.getFavorites())
println(t.getRetweets())

println(t.getMentions())
println(t.getHashtagas())