class Problem120

	def get_reminder(a,n)
		((a-1) ** n + (a+1) ** n) % (a ** 2)
	end

end

#i used brute force :(

p = Problem120.new
reminders = {}

for a in 3..1000
	n = 1
	rem = 0
	r_max = 0
	tmp = []
	while(true)
		rem = p.get_reminder(a,n)
		if rem == 2
			n = n + 1
			next
		end
		if !tmp.include?(rem)
			tmp << rem
		else
			r_max = tmp.max
			break
		end
		n = n + 1
	end
	reminders[a] = r_max
	puts a.to_s+" over "+r_max.to_s
end
sum = 0
reminders.each{|key,val| sum = sum + val}
puts sum